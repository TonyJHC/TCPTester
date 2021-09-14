import java.util.Map;

import com.kt.smcp.gw.ca.gwfrwk.adap.stdsys.sdk.tcp.LogIf;


//수신된 데이터를 뽑아 올 수 있도록 하는 클래
public class MyLogIF extends LogIf{// 상속해서 재정의 할거임. ( 오버라이드 )
	
	@Override
	public void handleControlReq(Long arg0, Map<String, Double> arg1, Map<String, String> strValues) {
		// TODO Auto-generated method stub
		super.handleControlReq(arg0, arg1, strValues);
		
		if(strValues.size() > 0) {
			//IoTMakers에서 디바이스로 제어 신호를 보낼  어떠한 태그 스트림의 값을 보낼 것인지 get안에 적어주면 됨.
			System.out.println("LED 값은 " + strValues.get("LED")); // LED 라는 키값으로 value를 얻는다 . ON 혹은 OFF
		}
		
	} 
	
	

}
