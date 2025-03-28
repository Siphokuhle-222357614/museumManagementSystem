package za.ac.cput.domain;
//phelo 213229153
import java.time.LocalDate;

public class exhibition {
    private String title;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
    private String location;
    private Long curatorID;

    //empty  constructor
    public exhibition() {

    }
    //constructor
    /*
    public exhibition(String title, LocalDate startDate, LocalDate endDate, String description, String location, Long curatorID) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.location = location;
        this.curatorID = curatorID;
    }

     */
    //Builder
    public exhibition(exhibition.Builder builder) {
        this.title = builder.title;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.description = builder.description;
        this.location = builder.location;
        this.curatorID = builder.curatorID;
    }

    //create my getters

    public String getTitle() {
        return title;
    }

    public LocalDate startDate() {
        return startDate;
    }

    public LocalDate endDate() {
        return endDate;
    }
    public String description() {
        return description;
    }
    public String location() {
        return location;
    }
    public Long curatorID() {
        return curatorID;
    }

    //ToString
    @Override
    public String toString() {
        return "exhibition{" +
                "title='" + title + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", curatorID=" + curatorID +
                '}';
    }
    public static class Builder {
        private String title;
        private LocalDate startDate;
        private LocalDate endDate;
        private String description;
        private String location;
        private Long curatorID;

        public Builder title(String title) {
            this.title = title;
            return this;
        }
        public Builder startDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }
        public Builder endDate(LocalDate endDate) {
            this.endDate = endDate;
            return this;
        }
        public Builder description(String description) {
            this.description = description;
            return this;
        }
        public Builder location(String location) {
            this.location = location;
            return this;
        }
        public Builder curatorID(Long curatorID) {
            this.curatorID = curatorID;
            return this;
        }
        public exhibition build() { return new exhibition(this); }
    }
}
