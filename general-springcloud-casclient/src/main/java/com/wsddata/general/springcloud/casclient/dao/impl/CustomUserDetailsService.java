package com.wsddata.general.springcloud.casclient.dao.impl;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.springframework.security.cas.authentication.CasAssertionAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.wsddata.general.springcloud.casclient.entity.UserInfo;

public class CustomUserDetailsService implements AuthenticationUserDetailsService<CasAssertionAuthenticationToken>{

	@Override
	public UserDetails loadUserDetails(CasAssertionAuthenticationToken token) throws UsernameNotFoundException {
		Map<String,Object> map = token.getAssertion().getPrincipal().getAttributes();
		UserInfo userDetails = new UserInfo();
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		userDetails.setAccountID(map.get("accountID").toString());
		userDetails.setCardID(map.get("cardID").toString());
		userDetails.setDepName(map.get("depName").toString());
		userDetails.setDepNO(map.get("depNO").toString());
		userDetails.setEmail(map.get("email").toString());
		userDetails.setPassword("");
		userDetails.setUserAccount(map.get("userAccount").toString());
		userDetails.setUsername(map.get("userName").toString());
		userDetails.setUserNO(map.get("userNO").toString());
		userDetails.setUserType(map.get("userType").toString());
		userDetails.setEnabled(true);
		userDetails.setCredentialsNonExpired(true);
		userDetails.setAccountNonExpired(true);
		userDetails.setAccountNonLocked(true);
		SimpleGrantedAuthority sga = new SimpleGrantedAuthority("authorities");
		authorities.add(sga);
		userDetails.setAuthorities(authorities);
		return userDetails;
	}
}
