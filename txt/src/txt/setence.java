package txt;

public class setence
	{

		static String a = "郑吒一直觉得自己死在现实中，上班下班，吃饭排泄，睡觉醒来，他不知道自己的意义何在，绝不会在于主任那张肥油直冒的笑脸里，"
				+ "绝对不会在于酒吧结识的所谓白领女子体内，也绝对不会在于这个一望无边的钢铁丛林——现代化都市中。"
				+ "郑吒觉得自己快腐烂了，从二十四岁一直腐烂到老，然后化为泥土变成一个名字，不，连一个名字都不会存在，因为没有人会记得你，谁也不会记得一个小小的白领，无论他是真正高雅，还是故做小资，他只是这尘世间的一粒尘土。"
				+ "他想改变些什么，他想有自己的意义……“想明白生命的意义吗？想真正的……活着吗？”";
		static String a1 = "郑吒";
		static String a2 = "。";
		String a3 = "“";
		String a4 = "”";
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
