This application reads configuration properties from consul and vault.

1.	Start vault server using below command

vault server -dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"

2.	Open another cmd prompt, use CLI to add some key-value in vault using below commads

set VAULT_ADDR=http://127.0.0.1:8200
set VAULT_TOKEN=00000000-0000-0000-0000-000000000000

vault kv put secret/vault-example example.username=demouser example.password=demopassword

3.	Start consul server (single node, agent mode), add key-value.

consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=127.0.0.1

consul kv put config/vault-example/testkey testvalue

4.	Start the application.