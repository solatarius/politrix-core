package com.politrix;

import com.politrix.sphere.SphereOfInfluence;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by stdavis on 2/7/17.
 */
public class Governor {
    private final SphereOfInfluence parent;
    private final Set<SphereOfInfluence> children;

    public Governor(SphereOfInfluence parent) {
        this(parent, new HashSet<>());
    }

    public Governor(SphereOfInfluence parent, Set<SphereOfInfluence> children) {
        this.parent = parent;
        this.children = children;
    }
}
