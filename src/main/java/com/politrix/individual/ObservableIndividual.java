package com.politrix.individual;

import com.politrix.sphere.SphereOfInfluenceObserver;

/**
 * Created by stdavis on 2/5/17.
 */
public interface ObservableIndividual {
    boolean registerIndividual(IndividualObserver observer);
    boolean deregisterIndividual(IndividualObserver observer);
    void notifyIndividuals();

    boolean registerSphere(SphereOfInfluenceObserver observer);
    boolean deregisterSphere(SphereOfInfluenceObserver observer);
    void notifySpheres();
}
