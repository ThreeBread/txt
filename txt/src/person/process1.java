package person;

public class process1
	{
		txtName t = new txtName();

		// ���ɶ��󡪡�����
		mRole r = new mRole("��Nick", 112, 100, 97, 100, 103, 107, null);

		public process1()
			{
				teamCount();
				addPeople(6);

			}

		/*
		 * ������������
		 */
		public void teamCount()
			{
				// ������飬�����Ƕ����������
				t.names_team = new String[10];
				t.names_team_die = new String[10];
				t.names_bookTeam = new String[10];
				t.names_bookTeamDie = new String[10];
			}

		/**
		 * ������������
		 */
		public void addPeople(int n)
			{

				// ���Ǽ������
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
		 * ɾ�������ڶ������������
		 * 
		 * @param names
		 *            ���ֿ�����
		 * @param string
		 *            ���ֵ�����
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

		// �¼�����
		public static void main(String[] args)
			{
				process1 p = new process1();
			}
	}
