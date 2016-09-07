package person;

import java.util.Arrays;

public class mRole
	{
		String name;
		int strong;
		int mind;
		int cellLive;
		int reflex;
		int mutation;
		int iq;
		String pack[];

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String[] getPack()
			{
				return pack;
			}

		public void setPack(String[] pack)
			{
				this.pack = pack;
			}

		public int getStrong()
			{
				return strong;
			}

		public void setStrong(int strong)
			{
				this.strong = strong;
			}

		public int getMind()
			{
				return mind;
			}

		public void setMind(int mind)
			{
				this.mind = mind;
			}

		public int getCellLive()
			{
				return cellLive;
			}

		public void setCellLive(int cellLive)
			{
				this.cellLive = cellLive;
			}

		public int getReflex()
			{
				return reflex;
			}

		public void setReflex(int reflex)
			{
				this.reflex = reflex;
			}

		public int getMutation()
			{
				return mutation;
			}

		public void setMutation(int mutation)
			{
				this.mutation = mutation;
			}

		public int getIq()
			{
				return iq;
			}

		public void setIq(int iq)
			{
				this.iq = iq;
			}

		public mRole(String name, int strong, int mind, int cellLive, int reflex, int mutation, int iq, String[] pack)
			{
				super();
				this.name = name;
				this.strong = strong;
				this.mind = mind;
				this.cellLive = cellLive;
				this.reflex = reflex;
				this.mutation = mutation;
				this.iq = iq;
				this.pack = pack;
			}

		@Override
		public String toString()
			{
				return "mRole [�ҵ����ֽ�" + name + ", ������֯=" + strong + ", ������=" + mind + ", ϸ������=" + cellLive + ", �񾭷�Ӧ�ٶ�="
						+ reflex + ", ������=" + mutation + ", ����=" + iq + ", ������=" + Arrays.toString(pack) + "]";
			}

	}
