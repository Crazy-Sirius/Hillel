package Observer;

/**
 * Created by toor on 11.04.17.
 */
public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("Junior");
        jobSite.addVacancy("Middle");

        Observer firstSubscriber = new Subscriber("Yurii");
        Observer secondSubcriber = new Subscriber("Kot");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubcriber);

        jobSite.addVacancy("Senior");

        jobSite.removeObserver(firstSubscriber);
        jobSite.addVacancy("Senior 2");

        jobSite.removeVacancy("Middle");

    }
}
