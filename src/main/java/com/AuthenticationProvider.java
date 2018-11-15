
package com;
 
   /*
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
 
public class AuthenticationProvider extends AbstractUserDetailsAuthenticationProvider {

    private MemberDAO memberDAO;
    private Member member;

    public AuthenticationProvider() throws ClassNotFoundException, SQLException {
        memberDAO = new MemberDAO();
    }

 
    @Override
    protected UserDetails retrieveUser(String email, UsernamePasswordAuthenticationToken upat)
            throws AuthenticationException {
      
        ArrayList<Member> list = memberDAO.getAllMember();
        for (Member member : list) {

        String password = upat.getCredentials().toString();
        List<GrantedAuthority> authorities = new ArrayList();
        if (member.getEmail().equals(email) && member.getPassword().equals(password)) {
            member = new Member(email, password, authorities);
            member.setEmail(email);
        } else {
            throw new BadCredentialsException("Username and password wrong!");
        }
    }
        return member;
    }

    @Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
		
    }
    */
 