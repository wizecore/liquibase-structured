# liquibase-structured

Custom liquibase task to make changes based on views and stored procedure definitions stored in separate files

*PHASE: Research & development. This is not yet complete.*

 * Read all definitions from files
 * Parse them
 * Extract every definition from database
 * Compare it with on disk representation
 * Extract permissions for object
 * Make patch with new body and permissions
 * [TABLE] Produce as alter table statements (reuse Liquibase functionality)

 
