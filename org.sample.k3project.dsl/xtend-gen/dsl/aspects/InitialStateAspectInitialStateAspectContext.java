package dsl.aspects;

import dsl.InitialState;
import dsl.aspects.InitialStateAspectInitialStateAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class InitialStateAspectInitialStateAspectContext {
  public final static InitialStateAspectInitialStateAspectContext INSTANCE = new InitialStateAspectInitialStateAspectContext();
  
  public static InitialStateAspectInitialStateAspectProperties getSelf(final InitialState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new dsl.aspects.InitialStateAspectInitialStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InitialState, InitialStateAspectInitialStateAspectProperties> map = new java.util.WeakHashMap<dsl.InitialState, dsl.aspects.InitialStateAspectInitialStateAspectProperties>();
  
  public Map<InitialState, InitialStateAspectInitialStateAspectProperties> getMap() {
    return map;
  }
}
