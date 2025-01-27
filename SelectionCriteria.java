package missonToMars;

public class SelectionCriteria {
    private String qualification; 
	private int maxAge;
    private int minAge;
    private String occupation;
    private int years_of_work_experience;
    private boolean health_records;
    private boolean criminal_records;
    private String computer_skills;
    private String language;
    
    public SelectionCriteria() {
    	qualification = "Undefined";
    	maxAge = 0;
    	minAge = 0;
    	occupation = "Undefined";
    	years_of_work_experience = 0;
    	health_records = true;
    	criminal_records = true;
    	computer_skills = "Undefined";
    	language = "Undefined";
    }
    
    public String getOccupation() {
    	return occupation;
    }
    
    public int getMaxAge() {
        return maxAge;
    }
    
    public int getMinAge() {
    	return minAge;
    }
    
    public String getQualification() {
    	return qualification;
    }
    public int getYears_of_work_experience() {
        return years_of_work_experience;
    }

    public boolean getHealth_records() {
        return health_records;
    }

    public boolean getCriminal_records( ) {
    	return criminal_records;
    }
    
    public String getComputer_skills() {
    	return computer_skills;
    }
    
    public String getLanguage() {
    	return language;
    }
    
    public void setQualification(String qualification) {
    	this.qualification = qualification;
    }
    
    public void setOccupation(String occupation) {
    	this.occupation = occupation;
    }
    
    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public void setMinAge(int minAge) {
    	this.minAge = minAge;
    }
    
    public void setYears_of_work_experience(int years_of_work_experience) {
        this.years_of_work_experience = years_of_work_experience;
    }

    public void setHealth_records(boolean health_records) {
        this.health_records = health_records;
    }
    
    public void setCriminal_records(boolean criminal_records) {
    	this.criminal_records = criminal_records;
    }
    
    public void setComputer_skills(String computer_skills) {
    	this.computer_skills = computer_skills;
    }
    
    public void setLanguage(String language) {
    	this.language = language;
    }
}