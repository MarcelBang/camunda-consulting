package org.camunda.bpm.demo.cockpit.plugin.reporting.resources;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import org.camunda.bpm.cockpit.plugin.resource.AbstractCockpitPluginRootResource;
import org.camunda.bpm.demo.cockpit.plugin.reporting.ProcessCountBarPlugin;

@Path("plugin/" + ProcessCountBarPlugin.ID)
public class ReportingPluginRootResource extends AbstractCockpitPluginRootResource {

  public ReportingPluginRootResource() {
    super(ProcessCountBarPlugin.ID);
  }

  @Path("{engineName}/process-instance-count")
  public ProcessInstanceCountResource getProcessInstanceResource(@PathParam("engineName") String engineName) {
    return subResource(new ProcessInstanceCountResource(engineName), engineName);
  }
  

//  @Path("{engineName}/demo-data")
//  public DemoDataGeneratorResource generateDemotData(@PathParam("engineName") String engineName) {
//    return subResource(new DemoDataGeneratorResource(engineName), engineName);
//  }

}
