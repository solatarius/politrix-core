package com.politrix.sphere;

import com.politrix.individual.IndividualObserver;
import com.politrix.issue.IssueObserver;

/**
 * Created by stdavis on 2/5/17.
 */
public interface SphereOfInfluence extends ObservableSphereOfInfluence, SphereOfInfluenceObserver, IssueObserver, IndividualObserver {
}
