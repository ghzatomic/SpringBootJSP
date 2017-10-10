package demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteListRestController {

	
	@RequestMapping("/getAll")
	public DataTableDTO getAll(){
		DataTableDTO dto = new DataTableDTO();
		List<TesteDTO> ret = new ArrayList<>();
		
		
		ret.add(new TesteDTO("um"));
		ret.add(new TesteDTO("dois"));
		dto.setData(ret);
		dto.setDraw(1);
		dto.setRecordsFiltered(ret.size());
		dto.setRecordsTotal(ret.size());
		return dto;
	}
	
	
}
