package EnumsAndComparators ;




public class ResearchPaperComporator
{
	public ResearchPaperComporator(){
		super();
	}
	
	public int compareByCitations(ResearchPapers p1, ResearchPapers p2) {
    	return Integer.compare(p1.getCitations(), p2.getCitations());
}

	public int compareByPublicationDate(ResearchPapers p1, ResearchPapers p2) {
    	return p1.getPublicationDate().compareTo(p2.getPublicationDate());
}

	public int compareByImpactFactor(ResearchPapers p1, ResearchPapers p2) {
	    return Double.compare(p1.getImpactFactor(), p2.getImpactFactor());
}
}
