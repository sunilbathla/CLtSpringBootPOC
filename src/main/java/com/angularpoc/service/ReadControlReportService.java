package com.angularpoc.service;
/*
 * import java.io.IOException; import java.nio.file.DirectoryStream; import
 * java.nio.file.Files; import java.nio.file.Path; import java.nio.file.Paths;
 * import java.time.Duration; import java.time.LocalDateTime; import
 * java.time.format.DateTimeFormatter; import java.util.ArrayList; import
 * java.util.List; import java.util.Optional; import java.util.ResourceBundle;
 * import java.util.stream.Collectors; import java.util.stream.Stream;
 * 
 * import org.springframework.stereotype.Service;
 * 
 * import com.angularpoc.dto.BEDashBoardDTO; import
 * com.angularpoc.model.BEDashBoardModel;
 * 
 * @Service public class ReadControlReportService {
 * 
 * private String fileSource;
 * 
 * public List<BEDashBoardModel> readControlReport(String environment) {
 * List<BEDashBoardModel> aoBEDashBoardModel = new ArrayList<>();
 * this.getUATURL(environment); try (DirectoryStream<Path> dirs =
 * Files.newDirectoryStream( Paths.get(fileSource), path ->
 * path.getFileName().toString().startsWith("RQ") ||
 * path.getFileName().toString().startsWith("SD"))) {
 * 
 * List<BEDashBoardDTO> aoBEDashBoardDto = new ArrayList<>();
 * 
 * dirs.forEach(action -> { BEDashBoardModel be = readFileContent(action);
 * aoBEDashBoardModel.add(be); });
 * 
 * aoBEDashBoardModel.forEach(be -> { BEDashBoardDTO beDashBoardDTO = new
 * BEDashBoardDTO(); beDashBoardDTO.setBatchName(be.getBatchName());
 * beDashBoardDTO.setBatchDescription(be.getBatchDescription());
 * if(!be.getEndDateTime().isPresent()) {
 * System.out.println("Batch started on "+be.getBeginDateTime().get().
 * toLocalDate()+" at = "+be.getBeginDateTime().get().toLocalTime() +
 * " But Batch never ended "+be.getBatchName()); }else if
 * (be.getBeginDateTime().isPresent() ) {
 * beDashBoardDTO.setBeginDateTime(be.getBeginDateTime().get());
 * beDashBoardDTO.setEndDateTime(be.getEndDateTime().get()); Duration duration =
 * Duration.between(be.getBeginDateTime().get(), be.getEndDateTime().get());
 * System.out.println("To complete Batch "+be.getBatchName()+
 * " No of Seconds "+duration.getSeconds() +" with status "+be.getStatus()); }
 * aoBEDashBoardDto.add(beDashBoardDTO); }); } catch (IOException e1) {
 * e1.printStackTrace(); }
 * 
 * return aoBEDashBoardModel; }
 * 
 * private void getUATURL(String envName) { ResourceBundle resourceBundle =
 * ResourceBundle.getBundle("resources"); this.fileSource =
 * resourceBundle.getString("fileSource_".concat(envName)); }
 * 
 * private BEDashBoardModel readFileContent(Path filePath) { BEDashBoardModel be
 * = new BEDashBoardModel(); try (Stream<String> lines = Files.lines(filePath))
 * {
 * 
 * DateTimeFormatter df =
 * DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss zzz uuuu"); List<String>
 * beginDatetTime = lines .filter(s -> s.contains("Begin Date/Time") ||
 * s.contains("End Date/Time") || s.contains("Batch Job Name")||
 * s.contains("Application Completed Successfully"))
 * .collect(Collectors.toList());
 * 
 * String fileName = filePath.getFileName().toString();
 * be.setBatchName(fileName.subSequence(0, fileName.indexOf("_")).toString());
 * 
 * beginDatetTime.forEach(line->{ String lineItem =
 * line.substring(line.indexOf(":") + 1).trim(); if(line.startsWith("Begin")) {
 * be.setBeginDateTime(Optional.of(LocalDateTime.parse(lineItem, df))); }else
 * if(line.startsWith("End")) {
 * be.setEndDateTime(Optional.of(LocalDateTime.parse(lineItem, df))); }else
 * if(line.startsWith("Batch")) { be.setBatchDescription(lineItem); }else
 * if(lineItem.startsWith("Application")) { be.setStatus(lineItem); } }); }
 * catch (IOException e) {
 * 
 * e.printStackTrace(); } return be; } }
 */