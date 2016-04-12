package edu.scu.projects.crawler;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * @author kgupta1.scu.edu
 * report for all the extracted urls
 *
 */
public class CrawlerReport {
	
	private List<URLReport> reports;

	public CrawlerReport() {
		super();
		reports = new ArrayList<URLReport>();
	}
	
	private void addURLReport(URLReport report)
	{
		reports.add(report);
	}

	public List<URLReport> getReports() {
		return reports;
	}

}
