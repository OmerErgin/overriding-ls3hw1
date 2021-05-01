
public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] baseKrediManagers = new BaseKrediManager[] {
			new OgrenciKrediManager(),
			new EsnafKrediManager(),
			new TarimKrediManager()
		};
		for (BaseKrediManager baseKrediManager: baseKrediManagers) {
			System.out.println(baseKrediManager.hesapla(10000));
		}

	}

}
