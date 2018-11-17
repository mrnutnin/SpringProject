package com.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.Member;
import com.dao.MemberDAO;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@EnableAutoConfiguration
@Controller
public class PageController {

    private MemberDAO memberDAO;
    private Member member;

    public PageController() throws ClassNotFoundException, SQLException {
        memberDAO = new MemberDAO();
    }

    @GetMapping("/register")
    public String register(Model model) {
        // ..
        return "/register-form";
    }

    @PostMapping("/addMember")
    public String addMember(@RequestParam("email") String email, @RequestParam("password") String password,
            @RequestParam("username") String username, @RequestParam("phone") String phone, Model model)
            throws SQLException {
        Member m = memberDAO.getMemberForSignUp(email);
        if (m != null) {
            model.addAttribute("result", "Register Fail!!.");
            model.addAttribute("detail", "This email is already used.");
        } else {
            member = new Member(email, password, username, phone, "user");
            memberDAO.createMember(member);
            model.addAttribute("result", "Registered !!.");
            model.addAttribute("detail", "Welcome to Cryptocurrency Market!!");
        }

        return "/registered";
    }

    @PostMapping("/listMember")
    public String listMember(@RequestParam("email") String email, @RequestParam("password") String password,
            @RequestParam("permiss") String permiss, Model model) throws SQLException {
        if (permiss.equals("admin")) {
            ArrayList<Member> list = memberDAO.getAllMember();
            model.addAttribute("memberList", list);
            model.addAttribute("email", email);
            model.addAttribute("password", password);
            model.addAttribute("permiss", permiss);
            return "/list-Member";
        }
        return "/login-form";

    }

    @PostMapping("/deleteMember")
    public String deleteMember(@RequestParam("email") String email, @RequestParam("password") String password,
            @RequestParam("permiss") String permiss, Model model) throws SQLException {
        Member member = memberDAO.getAdmin(permiss);
        if (permiss.equals("admin")) {
            memberDAO.deleteMember(email);
            ArrayList<Member> list = memberDAO.getAllMember();
            model.addAttribute("memberList", list);
            model.addAttribute("email", member.getEmail());
            model.addAttribute("password", member.getPassword());
            model.addAttribute("permiss", member.getPermiss());
            return "/list-Member";
        }
        return "/login-form";
    }

    @PostMapping("/editProfile")
    public String editProfile(@RequestParam("email") String email, Model model) throws SQLException {
        Member member = memberDAO.getMemberForEidit(email);
        model.addAttribute("member", member);
        return "/edit-profile-form";
    }

    @PostMapping("/updateMember")
    public String updateMember(@RequestParam("email") String email, @RequestParam("password") String password,
            @RequestParam("username") String username, @RequestParam("phone") String phone, Model model)
            throws SQLException {
        member = new Member(email, password, username, phone, "user");
        memberDAO.updateMember(member);
        return "/update-result";
    }

}