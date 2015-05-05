package org.camunda.bpm.custom;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.engine.impl.cfg.ProcessEnginePlugin;

/**
 * @author Ingo Richtsmeier
 *
 */
public class CustomHistoryHandlerPlugin implements ProcessEnginePlugin {
  
  public void preInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
    // Nothing here
  }

  public void postInit(ProcessEngineConfigurationImpl processEngineConfiguration) {
    
	  processEngineConfiguration.setHistoryEventHandler(new CustomDbHistoryEventHandler());
  }

  public void postProcessEngineBuild(ProcessEngine processEngine) {
    // nothing here
  }
}
