package com.zentect.list.constant;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class ListConstant {
	/**
	 * @author Jyoti Mekal
	 *
	 * All constant list maintain here.
	 */
	

	public static final Map<String, String> titleMap;
    static {
        Map<String, String> aMap = new HashMap<String, String>();
        aMap.put("Mr", "Mr");
        aMap.put("Mrs", "Mrs");
        aMap.put("Miss", "Miss");
        titleMap = Collections.unmodifiableMap(aMap);
    }
    //Training Type
    public static final Map<String, String> trainingTypeMap;
    static {
        Map<String, String> atrainingTypeMap = new HashMap<String, String>();
        atrainingTypeMap.put("Induction", "Induction");
        atrainingTypeMap.put("Refresher", "Refresher");
        trainingTypeMap = Collections.unmodifiableMap(atrainingTypeMap);
    }
    
    //User Type
    public static final Map<String, String> userTypeMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("FSO", "FSO");
        auserTypeMap.put("AO", "AO");
        userTypeMap = Collections.unmodifiableMap(auserTypeMap);
    }
    
  //User Type
    public static final Map<String, String> trainingPhaseMap;
    static {
        Map<String, String> atrainingPhaseMap = new HashMap<String, String>();
        atrainingPhaseMap.put("Initial", "Initial");
        atrainingPhaseMap.put("Completed", "Completed");
        atrainingPhaseMap.put("Confirmed", "Confirmed");
        trainingPhaseMap = Collections.unmodifiableMap(atrainingPhaseMap);
    }
    
  //User Type
    public static final Map<String, String> statusMap;
    static {
        Map<String, String> astatusMap = new HashMap<String, String>();
        astatusMap.put("A", "Active");
        astatusMap.put("I", "InActive");
        statusMap = Collections.unmodifiableMap(astatusMap);
    }
    
  //User Type
    public static final Map<String, String> userStatusMap;
    static {
        Map<String, String> auserStatusMap = new HashMap<String, String>();
        auserStatusMap.put("PEN", "Pending");
        auserStatusMap.put("CON", "Confirmed");
        auserStatusMap.put("REH", "Rejected");
        userStatusMap = Collections.unmodifiableMap(auserStatusMap);
    }
    
  //User Type
    public static final Map<String, String> noOfOptionMap;
    static {
        Map<String, String> anoOfOptionMap = new HashMap<String, String>();
        anoOfOptionMap.put("1", "1");
        anoOfOptionMap.put("2", "2");
        anoOfOptionMap.put("3", "3");
        anoOfOptionMap.put("4", "4");
        anoOfOptionMap.put("5", "5");
        anoOfOptionMap.put("6", "6");
        noOfOptionMap = Collections.unmodifiableMap(anoOfOptionMap);
    }
    
  //User Type
    private static final Map<String, String> trainingTopicMap;
    static {
        Map<String, String> atrainingTopicMap = new HashMap<String, String>();
        atrainingTopicMap.put("FOOD", "FOOD");
        trainingTopicMap = Collections.unmodifiableMap(atrainingTopicMap);
    }
    
  //User Type
    public static final Map<String, String> expBGMap;
    static {
        Map<String, String> aexpBGMap = new HashMap<String, String>();
        aexpBGMap.put("IND", "Industry");
        aexpBGMap.put("ACD", "Academics");
        aexpBGMap.put("RD", "R&D");
        expBGMap = Collections.unmodifiableMap(aexpBGMap);
    }
    
    
	public static final Map<String, String> stateMap;
    static {
        Map<String, String> aMap = new HashMap<String, String>();
        aMap.put("Andaman and Nicobar Islands","Andaman and Nicobar Islands");
        aMap.put("Andhra Pradesh","Andhra Pradesh");
        aMap.put("Arunachal Pradesh","Arunachal Pradesh");
        aMap.put("Assam","Assam");
        aMap.put("Bihar","Bihar");
        aMap.put("Chandigarh","Chandigarh");
        aMap.put("Chhattisgarh","Chhattisgarh");
        aMap.put("Dadra and Nagar Haveli","Dadra and Nagar Haveli");
        aMap.put("Daman and Diu","Daman and Diu");
        aMap.put("Delhi","Delhi");
        aMap.put("Goa","Goa");
        aMap.put("Gujarat","Gujarat");
        aMap.put("Haryana","Haryana");
        aMap.put("Himachal Pradesh","Himachal Pradesh");
        aMap.put("Jammu and Kashmir","Jammu and Kashmir");
        aMap.put("Jharkhand","Jharkhand");
        aMap.put("Karnataka","Karnataka");
        aMap.put("Kerala","Kerala");
        aMap.put("Lakshadweep","Lakshadweep");
        aMap.put("Madhya Pradesh","Madhya Pradesh");
        aMap.put("Maharashtra","Maharashtra");
        aMap.put("Manipur","Manipur");
        aMap.put("Meghalaya","Meghalaya");
        aMap.put("Mizoram","Mizoram");
        aMap.put("Nagaland","Nagaland");
        aMap.put("Odisha","Odisha");
        aMap.put("Puducherry","Puducherry");
        aMap.put("Punjab","Punjab");
        aMap.put("Rajasthan","Rajasthan");
        aMap.put("Sikkim","Sikkim");
        aMap.put("Tamil Nadu","Tamil Nadu");
        aMap.put("Telengana","Telengana");
        aMap.put("Tripura","Tripura");
        aMap.put("Uttar Pradesh","Uttar Pradesh");
        aMap.put("Uttarakhand","Uttarakhand");
        aMap.put("West Bengal","West Bengal");
        stateMap = Collections.unmodifiableMap(aMap);
    }
    
	public static final Map<String, String> AssesmentTypeMap;
    static {
        Map<String, String> aMap = new HashMap<String, String>();
        aMap.put("Before Training", "Before Training");
        aMap.put("After Training", "After Training");
        AssesmentTypeMap = Collections.unmodifiableMap(aMap);
    }
    
    
    //feedbackUserTypeMap
    public static final Map<String, String> feedbackUserTypeMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("Trainer", "Trainer");
        auserTypeMap.put("Trainer", "Trainer");
        feedbackUserTypeMap = Collections.unmodifiableMap(auserTypeMap);
    }
    
    
  //feedbackCategoryMap
    public static final Map<String, String> feedbackCategoryMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("Trainer", "Trainer");
        auserTypeMap.put("Trainer", "Trainer");
        feedbackCategoryMap = Collections.unmodifiableMap(auserTypeMap);
    }
    
    // course 
    
    public static final Map<String, String> courseNameMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("GC-MS/MS", "GC-MS/MS");
        auserTypeMap.put("LC-MS/MS", "LC-MS/MS");
        auserTypeMap.put("ICS-MS", "ICS-MS");
        courseNameMap = Collections.unmodifiableMap(auserTypeMap);
    }
    
    
    public static final Map<String, String> TypeMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("Cancel", "Cancel");
        auserTypeMap.put("Update", "Update");
        TypeMap = Collections.unmodifiableMap(auserTypeMap);
    }
    
    
    //User Type
    public static final Map<String, String> vacancyMap;
    static {
        Map<String, String> avacancyMap = new HashMap<String, String>();
        avacancyMap.put("P", "Part time");
        avacancyMap.put("F", "Full time");
        vacancyMap = Collections.unmodifiableMap(avacancyMap);
    }
    
    
    public static final Map<String, String> trainingParterMap;
    static {
        Map<String, String> avacancyMap = new HashMap<String, String>();
        avacancyMap.put("1", "SUTRA");
        avacancyMap.put("2", "NIIT");
        avacancyMap.put("3", "JETKING");
        trainingParterMap = Collections.unmodifiableMap(avacancyMap);
    }
    
  
  
    //--------------
	public static final Map<String, String> instituteStatusMap;
	 static {
	        Map<String, String> iStatusMap = new HashMap<String, String>();
	        iStatusMap.put("1", "Completed");
	        iStatusMap.put("2", "Accepted");
	       
	        instituteStatusMap = Collections.unmodifiableMap(iStatusMap);
	    }
	public static Map<String, String> instituteAttendanceMap;
	 static {
	        Map<String, String> iAttendanceMap  = new HashMap<String, String>();
	        iAttendanceMap.put("1", "Present");
	        iAttendanceMap.put("2", "Absent");
	       
	        instituteAttendanceMap = Collections.unmodifiableMap(iAttendanceMap);
	    }
	    
	    //User Type
    public static final Map<String, String> trainingInstituteMap;
    static {
        Map<String, String> atrainingInstituteMap = new HashMap<String, String>();
        atrainingInstituteMap.put("FND", "FOUNDATION");
        trainingInstituteMap = Collections.unmodifiableMap(atrainingInstituteMap);
    }

    //User Type
    public static final Map<String, String> contentType;
    static {
    	Map<String, String> atrainingInstituteMap = new HashMap<String, String>();
    	atrainingInstituteMap.put("PPT", "PPT");
    	atrainingInstituteMap.put("VIDEO", "VIDEO");
    	atrainingInstituteMap.put("STUDYMATERIAL", "STUDYMATERIAL");
    	contentType = Collections.unmodifiableMap(atrainingInstituteMap);
    }
    

    public static final Map<String, String> TrainerMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("Mr.Anuj", "Mr.Anuj");
        auserTypeMap.put("Mr.mnuj", "Mr.mnuj");
        TrainerMap = Collections.unmodifiableMap(auserTypeMap);
    }
    
 // District 
    public static final Map<String, String> DistrictMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("Aurangabad", "Aurangabad");
        auserTypeMap.put("Kurla", "Kurla");
        auserTypeMap.put("Thane", "Thane");
        DistrictMap = Collections.unmodifiableMap(auserTypeMap);
    }
 // QualCategory
    public static final Map<String, String> QualCategoryMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("BSC", "BSC");
        auserTypeMap.put("MSC", "MSC");
        auserTypeMap.put("PHD/Doctorate", "PHD/Doctorate");
        auserTypeMap.put("B.Tech", "B.Tech");
        auserTypeMap.put("M.Tech", "M.Tech");
        auserTypeMap.put("Others", "Others");
        QualCategoryMap = Collections.unmodifiableMap(auserTypeMap);
    }
 // SubQualCategory
    public static final Map<String, String> SubQualCategoryMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("MicroBiology", "MicroBiology");
        auserTypeMap.put("BioChemistry", "BioChemistry");
        auserTypeMap.put("BioTechnology", "BioTechnology");
        auserTypeMap.put("Food Technology", "Food Technology");
        auserTypeMap.put("Others", "Others");
        SubQualCategoryMap = Collections.unmodifiableMap(auserTypeMap);
    }
    
    //employer catagry
    public static final Map<String, String> employerCategoryMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("Central gov", "Central gov");
        auserTypeMap.put("State gov", "State gov");
        auserTypeMap.put("private", "private");
        auserTypeMap.put("Municipality", "Municipality");
        employerCategoryMap = Collections.unmodifiableMap(auserTypeMap);
    }
    
  //designation
    public static final Map<String, String> designationMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("Junior scientist", "Junior scientist");
        auserTypeMap.put("Senior scientist", "Senior scientist");
        auserTypeMap.put("other", "other");
        designationMap = Collections.unmodifiableMap(auserTypeMap);
    }
    
    //Training Lab
    public static final Map<String, String> trainingLabMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("Lorem", "Lorem");
        auserTypeMap.put("Lorem", "Lorem");
        trainingLabMap = Collections.unmodifiableMap(auserTypeMap);
    }
    //Training Center
    public static final Map<String, String> trainingCenterMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("Adlab", "Adlab");
        auserTypeMap.put("Ecolab", "Ecolab");
        trainingCenterMap = Collections.unmodifiableMap(auserTypeMap);
    }
  //Training Center
    public static final Map<String, String> profileCodeMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("Trainee", "Trainee");
        auserTypeMap.put("Trainer", "Trainer");
        auserTypeMap.put("Training Partner", "Training Partner");
        profileCodeMap = Collections.unmodifiableMap(auserTypeMap);
    }
    //Training Lab
    public static final Map<String, String> subjectMap;
    static {
        Map<String, String> auserTypeMap = new HashMap<String, String>();
        auserTypeMap.put("aaaa", "aaa");
        auserTypeMap.put("bbb", "bbb");
        subjectMap = Collections.unmodifiableMap(auserTypeMap);
    }
}
