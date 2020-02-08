package dsl.aspects;

import com.google.common.base.Objects;
import dsl.FSM;
import dsl.State;
import dsl.Transition;
import dsl.aspects.FSMAspectFSMAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Scanner;
import org.eclipse.emf.common.util.EList;

@Aspect(className = FSM.class)
@SuppressWarnings("all")
public class FSMAspect {
  /**
   * @Step
   * def void execute() {
   * _self.state.forEach[s|println('''class ''' + s.name)]
   * }
   */
  @Step
  public static void interprete(final FSM _self) {
    final dsl.aspects.FSMAspectFSMAspectProperties _self_ = dsl.aspects.FSMAspectFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void interprete()
    if (_self instanceof dsl.FSM){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			dsl.aspects.FSMAspect._privk3_interprete(_self_, (dsl.FSM)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "FSM", "interprete");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_interprete(final FSMAspectFSMAspectProperties _self_, final FSM _self) {
    Scanner sc = new Scanner(System.in);
    State current = null;
    current = _self.getInitialstate();
    while ((!current.isIsFinal())) {
      {
        System.out.println("Veuillez saisir le transition trigger :");
        String str = null;
        str = sc.nextLine();
        EList<Transition> _transition = _self.getTransition();
        for (final Transition tr : _transition) {
          if ((Objects.equal(current.getName(), tr.getSource().getName()) && Objects.equal(str, tr.getTrigger()))) {
            System.out.println("********* Nouvelle transition *********");
            String _name = current.getName();
            String _plus = ("source : " + _name);
            System.out.println(_plus);
            current = tr.getTarget();
            String _name_1 = current.getName();
            String _plus_1 = ("target : " + _name_1);
            System.out.println(_plus_1);
          }
        }
      }
    }
  }
}
