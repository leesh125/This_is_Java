package chap18.sec05.exam08_objectinputstream_objectoutputstream;

import java.io.Serializable;

public class ClassA implements Serializable{
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4; // 바이트 변환 안됨(객체 출력시 제외)
}
