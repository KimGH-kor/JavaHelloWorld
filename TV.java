 public interface TV{
        //상수값(변하지 않는 값)으로 지정
        public int MAX_VOLUME = 100;
        public int MIN_VOLUME = 0;
       
        //추상메소드지만 interface에서는 그냥 만들어도 된다.
        public void turnOn();
        public void turnOff();
        public void changeVolume(int volume);
        public void changeChannel(int channel);
    }
//    원래 상수라면 final을 붙여 만들어야 하지만 interface는 안붙여도 된다.
//    변수를 선언하면 컴파일시 자동으로 아래와 같이 바뀌기 때문
//    public static final int MAX_VOLUME = 100;
//    public static final int MIN_VOLUME = 0;

//    인터페이스에서 정의된 메소드는 모두 추상 메소드(abstract)이다. 
//    변수를 선언하면 컴파일시 자동으로 아래와 같이 바뀌기 때문
//    public abstract void on();
//    public abstract void off();
//    public abstract void volume(int value);
//    public abstract void channel(int number);