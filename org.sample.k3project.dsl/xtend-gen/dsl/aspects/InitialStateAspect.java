package dsl.aspects;

import dsl.InitialState;
import dsl.aspects.StateAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;

@Aspect(className = InitialState.class)
@SuppressWarnings("all")
public class InitialStateAspect extends StateAspect {
}
