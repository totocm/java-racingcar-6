package racingcar.controller;

import racingcar.domain.ConvertService;
import racingcar.domain.RacingService;
import racingcar.domain.vo.CarVO;
import racingcar.io.InputOutput;

import java.util.List;

public class RacingController {
  private final static InputOutput io = new InputOutput();
  private final static ConvertService cs = new ConvertService();
  private final static RacingService rs = new RacingService();
  public RacingController(){}

  public List<String> carStringInputListOutput(){
    String carStrings = io.startCarInput();
    return cs.StringConvertList(carStrings);
  }

  public List<CarVO> racingCarList(List<String> carStringList){
    return rs.setCarListName(carStringList);
  }






}
