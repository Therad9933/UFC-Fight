
public class Fighter
	{
		private String name;
		private int weight;
		private String shortcolor;
		private int reach;
		private int height;
		private String strength;
		private int health;
		private int damage;
		private int kick;
		private int ground;
		private String block;
		
		public Fighter(String n, int w, String s, int r, int h, String i, int j, int d, int k, int g, String b)
		{
			name = n;
			weight = w;
			shortcolor = s;
			reach = r;
			height = h;
			strength = i;
			health = j;
			damage = d;
			kick = k;
			ground = g;
			block = b;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getWeight()
			{
				return weight;
			}

		public void setWeight(int weight)
			{
				this.weight = weight;
			}

		public String getShortcolor()
			{
				return shortcolor;
			}

		public void setShortcolor(String shortcolor)
			{
				this.shortcolor = shortcolor;
			}

		public int getReach()
			{
				return reach;
			}

		public void setReach(int reach)
			{
				this.reach = reach;
			}

		public int getHeight()
			{
				return height;
			}

		public void setHeight(int height)
			{
				this.height = height;
			}

		public String getStrength()
			{
				return strength;
			}

		public void setStrength(String strength)
			{
				this.strength = strength;
			}

		public int getHealth()
			{
				return health;
			}

		public void setHealth(int health)
			{
				this.health = health;
			}

		public int getDamage()
			{
				return damage;
			}

		public void setDamage(int damage)
			{
				this.damage = damage;
			}

		public int getKick()
			{
				return kick;
			}

		public void setKick(int kick)
			{
				this.kick = kick;
			}

		public int getGround()
			{
				return ground;
			}

		public void setGround(int ground)
			{
				this.ground = ground;
			}

		public String getBlock()
			{
				return block;
			}

		public void setBlock(String block)
			{
				this.block = block;
			}

		

	}