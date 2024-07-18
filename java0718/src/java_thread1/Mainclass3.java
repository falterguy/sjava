package java_thread1;

public class Mainclass3 {

	public static void main(String[] args) {
		MeThread th1=new MeThread(2000,"이천");
		MeThread th2=new MeThread(3000,"삼천");
		// 순차적으로 쓰레드 실행
		try {
			th1.join();
		}catch(Interupteger)
		
		
		
//		while(true) {
//			System.out.print("");
//			int num=MeThread.num;
//			if(MeThread.num==15) {
//				th1.stop();
//				th2.stop();
//				break;
//			}
//		}
	}

}
/* sleep (밀리세컨드)- 지정된 사간먼쿰 댜기
 * Start()-쓰레드 시작,run 매서드호출
 * join() - 해당 쓰레드가 끝날때 까지 다음 쓰레드 대기
	run() - 쓰레드가 실행하는 메서드
	stop()- 쓰레드 중단(사용권장X)
	interrupt()- 쓰헤드 중단
	setriop(정수값) -쓰레드의 우선순위
	getPriority()- 설정된 쓰레드 우선순위값
	isAlive()- 현재 쓰레드가 살아났다면 true, 종료되었으면 false
	
	suspend()-쓰레드를 일시정지 시킨다(사용을 권장하지 않음)
	resume() - 일시정지된 쓰레드를 실행(사용을 권장하지X)
	
	yield()-다른 쓰래드에게 실행 상태를 양보 하고 대기
	notify()- 대기 상태에 있는 쓰레드를 실행 대기 로 변환 실행대기에 있는 쓰레드는 실행 상태로 변환된다.
			
*/