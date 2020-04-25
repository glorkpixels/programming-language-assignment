
public class Announcements implements Announcement {

	public String courseName;
	public String announcementHeadline;
	public String announcementContent;

	public Announcements(String courseName, String announcementHeadline, String announcementContent) {
		super();
		this.courseName = courseName;
		this.announcementHeadline = announcementHeadline;
		this.announcementContent = announcementContent;
	}

	@Override
	public void setCourse(String cont) {
		// TODO Auto-generated method stub
		courseName = cont;

	}

	@Override
	public void announcementDetails() {
		// TODO Auto-generated method stub
		System.out.println(announcementHeadline + ": " + announcementContent);
	}

	@Override
	public void setAnnouncement(String head, String cont) {
		announcementHeadline = head;
		announcementContent = cont;

	}

	@Override
	public void setCourseofAnno(String name) {
		// TODO Auto-generated method stub

	}

}
