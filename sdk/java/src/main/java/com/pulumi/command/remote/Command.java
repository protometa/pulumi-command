// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.command.remote;

import com.pulumi.command.Utilities;
import com.pulumi.command.remote.CommandArgs;
import com.pulumi.command.remote.outputs.Connection;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A command to run on a remote host.
 * The connection is established via ssh.
 * 
 */
@ResourceType(type="command:remote:Command")
public class Command extends com.pulumi.resources.CustomResource {
    /**
     * The parameters with which to connect to the remote host
     * 
     */
    @Export(name="connection", type=Connection.class, parameters={})
    private Output</* @Nullable */ Connection> connection;

    /**
     * @return The parameters with which to connect to the remote host
     * 
     */
    public Output<Optional<Connection>> connection() {
        return Codegen.optional(this.connection);
    }
    /**
     * The command to run on create.
     * 
     */
    @Export(name="create", type=String.class, parameters={})
    private Output</* @Nullable */ String> create;

    /**
     * @return The command to run on create.
     * 
     */
    public Output<Optional<String>> create() {
        return Codegen.optional(this.create);
    }
    /**
     * The command to run on delete.
     * 
     */
    @Export(name="delete", type=String.class, parameters={})
    private Output</* @Nullable */ String> delete;

    /**
     * @return The command to run on delete.
     * 
     */
    public Output<Optional<String>> delete() {
        return Codegen.optional(this.delete);
    }
    /**
     * Additional environment variables available to the command&#39;s process.
     * 
     */
    @Export(name="environment", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> environment;

    /**
     * @return Additional environment variables available to the command&#39;s process.
     * 
     */
    public Output<Optional<Map<String,String>>> environment() {
        return Codegen.optional(this.environment);
    }
    /**
     * The standard error of the command&#39;s process
     * 
     */
    @Export(name="stderr", type=String.class, parameters={})
    private Output<String> stderr;

    /**
     * @return The standard error of the command&#39;s process
     * 
     */
    public Output<String> stderr() {
        return this.stderr;
    }
    /**
     * Pass a string to the command&#39;s process as standard in
     * 
     */
    @Export(name="stdin", type=String.class, parameters={})
    private Output</* @Nullable */ String> stdin;

    /**
     * @return Pass a string to the command&#39;s process as standard in
     * 
     */
    public Output<Optional<String>> stdin() {
        return Codegen.optional(this.stdin);
    }
    /**
     * The standard output of the command&#39;s process
     * 
     */
    @Export(name="stdout", type=String.class, parameters={})
    private Output<String> stdout;

    /**
     * @return The standard output of the command&#39;s process
     * 
     */
    public Output<String> stdout() {
        return this.stdout;
    }
    /**
     * Trigger replacements on changes to this input.
     * 
     */
    @Export(name="triggers", type=List.class, parameters={Object.class})
    private Output</* @Nullable */ List<Object>> triggers;

    /**
     * @return Trigger replacements on changes to this input.
     * 
     */
    public Output<Optional<List<Object>>> triggers() {
        return Codegen.optional(this.triggers);
    }
    /**
     * The command to run on update, if empty, create will run again.
     * 
     */
    @Export(name="update", type=String.class, parameters={})
    private Output</* @Nullable */ String> update;

    /**
     * @return The command to run on update, if empty, create will run again.
     * 
     */
    public Output<Optional<String>> update() {
        return Codegen.optional(this.update);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Command(String name) {
        this(name, CommandArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Command(String name, CommandArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Command(String name, CommandArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("command:remote:Command", name, args == null ? CommandArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Command(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("command:remote:Command", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Command get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Command(name, id, options);
    }
}
