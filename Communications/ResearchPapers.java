package Communications ;

public class ResearchPapers
{
	
	private int paper_id;
	
	private String title;
	
	private List<Researcher> authors;
	
	private Date publishDate;
	
	private List<String> citations;
	public Research Papers(){
		super();
	}
	
	public void printPaper() {
		// TODO implement me	
	}
	
	public String plainTextCitation() {
		// TODO implement me
		return "";	
	}
	
	public String bibtexCitation() {
		// TODO implement me
		return "";	
	}
	
	public String getCitiation() {
		// TODO implement me
		return "";	
	}
}
