package person;

public class process1
	{
		txtName t = new txtName();

		// 生成对象——主角
		mRole r = new mRole("大Nick", 112, 100, 97, 100, 103, 107, null);

		public process1()
			{
				teamCount();
				addPeople(6);

			}

		/*
		 * 队伍人数分配
		 */
		public void teamCount()
			{
				// 剧情队伍，和主角队伍分配人数
				t.names_team = new String[10];
				t.names_team_die = new String[10];
				t.names_bookTeam = new String[10];
				t.names_bookTeamDie = new String[10];
			}

		/**
		 * 队伍人数增加
		 */
		public void addPeople(int n)
			{

				// 主角加入队伍
				t.names_team[0] = r.name;
				int a;
				for (int i = 0; i < n; i++)
					{
						a = (int) (Math.random() * t.names.length - 1);
						t.names_team[n + 1] = t.names[a];
						t.names = remove(t.names, t.names[a]);

					}
			}

		/**
		 * 删除名字在队伍里面出过得
		 * 
		 * @param names
		 *            名字库数组
		 * @param string
		 *            出现的名字
		 * @return
		 */
		private String[] remove(String[] names, String string)
			{
				String[] tmp = new String[names.length - 1];

				int idx = 0;
				boolean hasRemove = false;
				for (int i = 0; i < names.length; i++)
					{

						if (!hasRemove && names[i] == string)
							{
								hasRemove = true;
								continue;
							}

						tmp[idx++] = names[i];
					}

				return tmp;
			}

		// 事件发生
		public static void main(String[] args)
			{
				process1 p = new process1();
			}
	}
