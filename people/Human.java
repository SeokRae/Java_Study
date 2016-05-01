package people;
/**
 *  최상위
 * @author Administrator
 *
 */
public class Human {
	
	// 배열 100개 생성 
	private String[] name = new String[100];
	private int[] age = new int[100];
	private boolean gender;
	private String[] job = new String[100];
	private String[] affiliation = new String[100];

	//
	public void Human() {
		for (int i = 0; i < this.name.length; i++) {
			System.out.println(
					"이름 : " + this.name[i] + "나이 : " + this.age[i] + "성별 없냐? : " + "직업 : " + this.job[i] + "소속 : " + this.affiliation[i]);
		}
	}

	// 생성자 오버로딩
	public Human(String[] name, int[] age, boolean gender, String[] job, String[] affiliation) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.job = job;
		this.affiliation = affiliation;

	}
	/*
	 * Getter Setter
	 */
	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}

	public int[] getAge() {
		return age;
	}

	public void setAge(int[] age) {
		this.age = age;
	}

	public boolean isgender() {
		return gender;
	}

	public void setgender(boolean gender) {
		this.gender = gender;
	}

	public String[] getJob() {
		return job;
	}

	public void setJob(String[] job) {
		this.job = job;
	}

	public String[] getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String[] affiliation) {
		this.affiliation = affiliation;
	}
}
