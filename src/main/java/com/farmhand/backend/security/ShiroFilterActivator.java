package com.farmhand.backend.security;

import javax.servlet.annotation.WebFilter;
import org.apache.shiro.web.servlet.ShiroFilter;

/**
 *
 * @author Helmut
 */
@WebFilter("/*")
class ShiroFilterActivator extends ShiroFilter  {
   private ShiroFilterActivator() {
   } 
}
