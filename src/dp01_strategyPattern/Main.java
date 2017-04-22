package dp01_strategyPattern;

public class Main {

	public static void main(String[] args) {
		//�������̽��� ����� ����� ���� �и��ϸ� ����� ����� �� �ִ� ��ΰ��ȴ�.
		Ainterface ainterface=new AinterfaceImp();
		ainterface.funA();
		
		//��������Ʈ(�����ϴ�)�� Ư����ü�� ����� ����ϱ� ���� �ٸ� ��ü�� ����� ȣ���ϴ°��̴�.
		Deligate deligate=new Deligate();
		deligate.funcA();
		
		//strategy pattern�̶� ���� �˰����� �ϳ��� �߻����� ������(�������̽�)�� �����
		//���������� ���� ��ȯ ����(set�޼ҵ�)�ϵ��� �ϴ� ����. ������ ���� ���ⱳü!
		GameChracter chracter= new GameChracter();
		chracter.attack();
		
		chracter.setWeapon(new Knife());
		chracter.attack();
		
		chracter.setWeapon(new Sword());
		chracter.attack();
		
		//�������� ��û: ������ ��������! ������ �������� ����
		chracter.setWeapon(new Axe());
		chracter.attack();
	}

}
