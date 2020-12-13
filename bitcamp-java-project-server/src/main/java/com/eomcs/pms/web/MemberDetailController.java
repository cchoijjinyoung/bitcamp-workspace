package com.eomcs.pms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

@Controller
public class MemberDetailController {

  @Autowired MemberService memberService;

  @RequestMapping("/member/detail")
  public ModelAndView execute(int no) throws Exception {
    Member member = memberService.get(no);
    if (member == null) {
      throw new Exception("해당 회원이 없습니다!");
    }
    ModelAndView mv = new ModelAndView();
    mv.addObject("member", member);
    mv.setViewName("/member/detail.jsp"); // jsp만 리턴할꺼면 리턴값을 String으로 설정.
    // 여기서는 addObject 로 맴버 값도 주기 때문에. ModelAndView 로 설정하였다.
    return mv;
  }
}
