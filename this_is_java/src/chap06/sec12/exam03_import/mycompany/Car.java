package chap06.sec12.exam03_import.mycompany;


import chap06.sec12.exam03_import.hankook.SnowTire;
import chap06.sec12.exam03_import.hankook.Tire;
// Window > Preferences > Java > Code Style > Organize Imports > 99를 1
// 그러면 ctrl + shift + o 할 때 *로 import 됨
import chap06.sec12.exam03_import.hyundai.Engine;
import chap06.sec12.exam03_import.kumho.BigWidthTire;

public class Car {
	Engine engine = new Engine();
	SnowTire tire1 = new SnowTire();
	BigWidthTire tire2 = new BigWidthTire();
	Tire tire3 = new Tire();
	// 다른 패키지에서 같은 이름을 가진 클래스를 import 할 경우 전체 경로를 적어줘야함
	chap06.sec12.exam03_import.kumho.Tire tire4 =
			new chap06.sec12.exam03_import.kumho.Tire();
}
