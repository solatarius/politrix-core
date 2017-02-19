package com.politrix.sphere;

import com.politrix.individual.IndividualObserver;
import com.politrix.issue.IssueObserver;

/**
 * Created by stdavis on 2/5/17.
 */
public interface ObservableSphereOfInfluence {
    void registerSphere(SphereOfInfluenceObserver observer);
    void deregisterSphere(SphereOfInfluenceObserver observer);
    void notifySpheres();

    void registerIndividual(IndividualObserver observer);
    void deregisterIndividual(IndividualObserver observer);
    void notifyIndividuals();

    void registerIssue(IssueObserver observer);
    void deregisterIssue(IssueObserver observer);
    void notifyIssues();
}
