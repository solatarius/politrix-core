package com.politrix.issue;

import com.politrix.individual.IndividualObserver;
import com.politrix.sphere.SphereOfInfluenceObserver;

/**
 * Created by stdavis on 2/5/17.
 */
public interface ObservableIssue {
    void registerIndividual(IndividualObserver observer);
    void deregisterIndividual(IndividualObserver observer);
    void notifyIndividuals();

    void registerSphere(SphereOfInfluenceObserver observer);
    void deregisterSphere(SphereOfInfluenceObserver observer);
    void notifySpheres();

    void registerIssue(IssueObserver observer);
    void deregisterIssue(IssueObserver observer);
    void notifyIssues();
}
