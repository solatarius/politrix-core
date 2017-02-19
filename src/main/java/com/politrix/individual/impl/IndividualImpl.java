package com.politrix.individual.impl;

import com.politrix.individual.Individual;
import com.politrix.individual.IndividualObserver;
import com.politrix.issue.Issue;
import com.politrix.sphere.SphereOfInfluence;
import com.politrix.sphere.SphereOfInfluenceObserver;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by stdavis on 2/5/17.
 */
public class IndividualImpl implements Individual {
    private final String userId;

    private Set<IndividualObserver> individualObservers;
    private Set<SphereOfInfluenceObserver> sphereObservers;

    private SphereOfInfluence origin, current;

    private Map<SphereOfInfluence, ? super Individual> representatives;
    private Set<Issue> createdIssues;

    public IndividualImpl(String userId, SphereOfInfluence origin) {
        this.userId = userId;
        this.origin = origin;
        this.current = origin;
        this.createdIssues = new HashSet<>();
        this.representatives = new HashMap<>();
        this.individualObservers = new HashSet<>();
        this.sphereObservers = new HashSet<>();
    }

    @Override
    public void update() {

    }

    @Override
    public boolean registerIndividual(IndividualObserver observer) {
        return false;
    }

    @Override
    public boolean deregisterIndividual(IndividualObserver observer) {
        return false;
    }

    @Override
    public void notifyIndividuals() {

    }

    @Override
    public boolean registerSphere(SphereOfInfluenceObserver observer) {
        return false;
    }

    @Override
    public boolean deregisterSphere(SphereOfInfluenceObserver observer) {
        return false;
    }

    @Override
    public void notifySpheres() {

    }
}
