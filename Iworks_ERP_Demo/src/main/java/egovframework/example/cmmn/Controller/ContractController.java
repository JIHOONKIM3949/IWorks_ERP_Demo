package egovframework.example.cmmn.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @  수정일                 수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2021.03.16    김지훈            최초 프로젝트 생성 

 */ 
  /////
@Controller
public class ContractController {
	private final static Logger logger = LoggerFactory.getLogger(ContractController.class);
	
	
	@RequestMapping("/Contract")
	public String GetContractInfo(Model model){
		logger.info("Contract 페이지 실행");
		return  "Views/Contract";
	}
}
