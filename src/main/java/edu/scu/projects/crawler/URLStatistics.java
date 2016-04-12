package edu.scu.projects.crawler;

import java.util.List;
/**
 * 
 * @author kgupta1.scu.edu 
 * Model class that captures the content of the web URL. 
 *
 */
public class URLStatistics {
	
	private String title;	
	private List<String> outLinks;
	private int images;
	
	public URLStatistics(String title, List<String> outLinks, int images) {
		super();
		this.title = title;
		this.outLinks = outLinks;
		this.images = images;
	}

	@Override
	public String toString() {
		return "URLStatistics [title=" + title + ", outLinks=" + outLinks
				+ ", images=" + images + "]";
	}

	public String getTitle() {
		return title;
	}

	public List<String> getOutLinks() {
		return outLinks;
	}

	public int getImages() {
		return images;
	}
	
	

	
}
