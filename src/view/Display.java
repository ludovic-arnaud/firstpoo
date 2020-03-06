package view;

public interface Display {
	
	public int askAge(int min, int max);
	public String askString(String type);
	public boolean askBoolean(String type);
	public void showInfos(String str);

}
