package txt;

public class setence
	{

		static String a = "֣߸һֱ�����Լ�������ʵ�У��ϰ��°࣬�Է���й��˯������������֪���Լ���������ڣ������������������ŷ���ֱð��Ц���"
				+ "���Բ������ھưɽ�ʶ����ν����Ů�����ڣ�Ҳ���Բ����������һ���ޱߵĸ������֡����ִ��������С�"
				+ "֣߸�����Լ��츯���ˣ��Ӷ�ʮ����һֱ���õ��ϣ�Ȼ��Ϊ�������һ�����֣�������һ�����ֶ�������ڣ���Ϊû���˻�ǵ��㣬˭Ҳ����ǵ�һ��СС�İ��죬���������������ţ����ǹ���С�ʣ���ֻ���⳾�����һ��������"
				+ "����ı�Щʲô���������Լ������塭�����������������������������ġ��������𣿡�";
		static String a1 = "֣߸";
		static String a2 = "��";
		String a3 = "��";
		String a4 = "��";
		static int a11;
		static int a12;
		int a13;
		int a14;

		public static int get1()
			{
				return a11 = a.indexOf(a1);
			};

		public static int get2()
			{
				return a12 = a.indexOf(a2);
			};

		public static void sub()
			{

			};

		public static void showA()
			{
				int d1 = get1();
				int d2 = get2();

				for (int i = 0; i < d2; i++)
					{
						String b = a.substring(i, i + 1);
						System.out.print(b);
					}

			}
	}
