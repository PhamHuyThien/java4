package model;
// Generated Apr 12, 2021 7:24:33 PM by Hibernate Tools 4.3.1



/**
 * Videos generated by hbm2java
 */
public class Videos  implements java.io.Serializable {


     private Integer id;
     private String title;
     private String poster;
     private Integer views;
     private String description;
     private Integer status;
     private Integer time;

    public Videos() {
    }

    public Videos(String title, String poster, Integer views, String description, Integer status, Integer time) {
       this.title = title;
       this.poster = poster;
       this.views = views;
       this.description = description;
       this.status = status;
       this.time = time;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPoster() {
        return this.poster;
    }
    
    public void setPoster(String poster) {
        this.poster = poster;
    }
    public Integer getViews() {
        return this.views;
    }
    
    public void setViews(Integer views) {
        this.views = views;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getTime() {
        return this.time;
    }
    
    public void setTime(Integer time) {
        this.time = time;
    }




}


