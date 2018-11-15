package com.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Member;
import com.MemberDAO;
import com.model.CoinMarket;
import com.model.CoinMarketList;
import com.Currency;
import java.text.NumberFormat;
import com.CoinMarketCap;

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

        member = new Member(email, password, username, phone);
        model.addAttribute("member", member);
        memberDAO.createMember(member);

        return "/registered";
    }

    @GetMapping("/listMember")
    public String listMember(Model model) throws SQLException {
    	ArrayList<Member> list = memberDAO.getAllMember();
    	model.addAttribute("memberList", list);
    	return "/list-Member";
    }

    @GetMapping("/deleteMember")
    public String deleteMember(@RequestParam("email")  String email, Model model) throws SQLException {
        memberDAO.deleteMember(email);
        return "/delete-result";
    }



   

}