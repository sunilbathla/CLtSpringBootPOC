package com.angularpoc.controller;

/*
 * import java.util.ArrayList; import java.util.Date; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.CrossOrigin; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.PathVariable; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.angularpoc.dao.BatchRequestDAO; import
 * com.angularpoc.dto.BatchRequestDto; import
 * com.angularpoc.model.BatchRequestModel; import
 * com.angularpoc.model.ResponseModel; import
 * com.angularpoc.service.BatchRequestService;
 * 
 * @CrossOrigin(value="http://localhost:4200")
 * 
 * @RestController
 * 
 * @RequestMapping("/batchRequest") public class RequestController {
 * 
 * @Autowired BatchRequestDAO batchRequestDao;
 * 
 * @Autowired BatchRequestService batchRequestService;
 * 
 * @GetMapping(value="/generateNewRequest") public ResponseModel
 * generateNewRequest() { BatchRequestDto batchRequestDto = new
 * BatchRequestDto(); batchRequestDto.setRqstDate(new Date());
 * batchRequestDto.setStatus(Boolean.FALSE); batchRequestDto =
 * batchRequestDao.save(batchRequestDto);
 * 
 * BatchRequestModel batchRequestModel = new BatchRequestModel();
 * batchRequestModel.setRqstId(batchRequestDto.getRqstId());
 * batchRequestModel.setRqstDate(batchRequestDto.getRqstDate());
 * batchRequestModel.setStatus(batchRequestDto.getStatus());
 * 
 * ResponseModel responseModel = new ResponseModel();
 * responseModel.setMessage("Batch Scheduled successfully");
 * responseModel.setResult(batchRequestModel);
 * 
 * return responseModel; }
 * 
 * @GetMapping(value="/getAllRequests") public ResponseModel getAllRequests() {
 * List<BatchRequestDto> aoBatchRequestDto = new ArrayList<>();
 * List<BatchRequestModel> aoBatchRequestModel = new ArrayList<>();
 * aoBatchRequestDto = batchRequestDao.findAll();
 * aoBatchRequestDto.forEach(batchRequestDto -> { BatchRequestModel
 * batchRequestModel = new BatchRequestModel();
 * batchRequestModel.setRqstId(batchRequestDto.getRqstId());
 * batchRequestModel.setRqstDate(batchRequestDto.getRqstDate());
 * batchRequestModel.setStatus(batchRequestDto.getStatus());
 * aoBatchRequestModel.add(batchRequestModel); });
 * 
 * ResponseModel responseModel = new ResponseModel();
 * responseModel.setMessage("List of Batch requests!");
 * responseModel.setResult(aoBatchRequestModel);
 * 
 * return responseModel; }
 * 
 * @GetMapping(value="/runRqstNow/{rqstId}") public ResponseModel
 * runRqstNow(@PathVariable("rqstId") int rqstId) { ResponseModel responseModel
 * = new ResponseModel();
 * responseModel.setMessage("Batch set to run successfully");
 * responseModel.setResult(batchRequestService.runRequestNow(rqstId));
 * 
 * return responseModel; }
 * 
 * }
 */