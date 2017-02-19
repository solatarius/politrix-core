package com.politrix.individual;

import com.politrix.issue.IssueObserver;
import com.politrix.sphere.SphereOfInfluenceObserver;
import com.politrix.util.Observer;

/**
 * Created by stdavis on 2/5/17.
 */
public interface Individual extends ObservableIndividual, IndividualObserver, IssueObserver, SphereOfInfluenceObserver {
}
