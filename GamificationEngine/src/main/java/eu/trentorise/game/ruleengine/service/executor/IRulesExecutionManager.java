package eu.trentorise.game.ruleengine.service.executor;

import eu.trentorise.game.ruleengine.service.IKnowledgeBuilder;
import java.util.Collection;

/**
 *
 * @author Luca Piras
 */
public interface IRulesExecutionManager {
    
    public void executeRules(IKnowledgeBuilder knowledgeBuilder,
                             Collection facts);
}