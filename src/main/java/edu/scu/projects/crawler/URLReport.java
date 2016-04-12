package edu.scu.projects.crawler;
/**
 * 
 * @author kgupta1.scu.edu
 * Storing crawled metadata and page metadata
 *
 */
public class URLReport {
	
	private String url;
	private String localPath;
	private String status;
	private URLStatistics content;
	
	public URLReport(String url, String localPath, String status,
			URLStatistics content) {
		super();
		this.url = url;
		this.localPath = localPath;
		this.status = status;
		this.content = content;
	}

	public String getUrl() {
		return url;
	}

	public String getLocalPath() {
		return localPath;
	}

	public String getStatus() {
		return status;
	}

	public URLStatistics getContent() {
		return content;
	}
	
	

}
