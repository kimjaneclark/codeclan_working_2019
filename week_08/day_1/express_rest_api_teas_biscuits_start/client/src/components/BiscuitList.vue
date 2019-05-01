<template lang="html">
	<div id="tea-list">
		<h2>All the biccys!</h2>
		<ul>
			<li v-for="biscuit in biscuits">{{ biscuit.name }} by {{ biscuit.brand }}</li>
		</ul>
	</div>
</template>

<script>
export default {
	name: "BiscuitList",
	props: ["biscuits"]
}
</script>

<style lang="css" scoped>
</style>
