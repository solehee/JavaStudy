package myinterface;

public interface Player {
	
	// 레벨
	int level();
	
	// 현질한 금액
	double expense();
	
	// 필수 이벤트 진행 여부
	boolean quest();
	
	// 여러 온라인 게임 모여있는데서 유저들 정보 모을때 쓰면 좋지않을까요? 
}
