 public interface TV{
        //�����(������ �ʴ� ��)���� ����
        public int MAX_VOLUME = 100;
        public int MIN_VOLUME = 0;
       
        //�߻�޼ҵ����� interface������ �׳� ���� �ȴ�.
        public void turnOn();
        public void turnOff();
        public void changeVolume(int volume);
        public void changeChannel(int channel);
    }
//    ���� ������ final�� �ٿ� ������ ������ interface�� �Ⱥٿ��� �ȴ�.
//    ������ �����ϸ� �����Ͻ� �ڵ����� �Ʒ��� ���� �ٲ�� ����
//    public static final int MAX_VOLUME = 100;
//    public static final int MIN_VOLUME = 0;

//    �������̽����� ���ǵ� �޼ҵ�� ��� �߻� �޼ҵ�(abstract)�̴�. 
//    ������ �����ϸ� �����Ͻ� �ڵ����� �Ʒ��� ���� �ٲ�� ����
//    public abstract void on();
//    public abstract void off();
//    public abstract void volume(int value);
//    public abstract void channel(int number);